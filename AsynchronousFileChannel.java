package org.example;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

public class Main {

    static class ReadCompletionHandler implements CompletionHandler<Integer, ByteBuffer> {
        private final AsynchronousFileChannel fileChannel;
        private final ByteBuffer buffer;
        private final Path filePath;
        private long position; // Track the current position in the file

        public ReadCompletionHandler(AsynchronousFileChannel fileChannel, ByteBuffer buffer, Path filePath, long initialPosition) {
            this.fileChannel = fileChannel;
            this.buffer = buffer;
            this.filePath = filePath;
            this.position = initialPosition; // Initialize the position
        }

        @Override
        public void completed(Integer result, ByteBuffer attachment) {
            if (result == -1) {
                // Достигнут конец файла
                System.out.println("Конец файла достигнут.");
                try {
                    fileChannel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }

            // Печатаем содержимое буфера
            buffer.flip();
            byte[] data = new byte[result];
            buffer.get(data);
            System.out.print(new String(data));
            buffer.clear();

            // Update the position
            position += result;

            // Читаем следующий фрагмент файла
            // Non-blocking read continues with the updated position
            fileChannel.read(buffer, position, buffer, this);
        }

        @Override
        public void failed(Throwable exc, ByteBuffer attachment) {
            System.err.println("Ошибка при чтении файла: " + exc.getMessage());
            try {
                fileChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\Users\\student\\IdeaProjects\\untitled7\\src\\main\\java\\org\\example\\large_input.txt"); // Укажите путь к вашему файлу

        try (AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(filePath, StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            // Initial position is 0
            fileChannel.read(buffer, 0, buffer, new ReadCompletionHandler(fileChannel, buffer, filePath, 0));
            // Ожидание завершения операции чтения
            Thread.sleep(5000);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
