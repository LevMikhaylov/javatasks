package ru.ithub.javatrainj;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static Logger instance;

    // Список для хранения сообщений логов
    private List<String> logMessages;

    // Приватный конструктор для предотвращения создания экземпляров извне
    private Logger() {
        logMessages = new ArrayList<>();
    }

    // Метод для получения единственного экземпляра Logger
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Метод для добавления сообщения в логи
    public void log(String message) {
        logMessages.add(message);
    }

    // Метод для вывода всех логов
    public void printLogs() {
        if (logMessages.isEmpty()) {
            System.out.println("Логи пусты.");
        } else {
            System.out.println("Сообщения логов:");
            for (String log : logMessages) {
                System.out.println(log);
            }
        }
    }
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Добавление сообщений в логи
        logger.log("Это первое сообщение лога.");
        logger.log("Произошла ошибка при выполнении операции.");
        logger.log("Операция завершена успешно.");

        // Вывод всех логов
        logger.printLogs();
    }
}
