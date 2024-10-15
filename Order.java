package ru.ithub.javatrainj;
enum OrderStatus {
    NEW,
    IN_PROGRESS,
    DELIVERED,
    CANCELLED
}
public class Order {
    private OrderStatus status;

    public Order() {
        this.status = OrderStatus.NEW; // Начальный статус заказа
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        // Логика проверки переходов статусов
        if (this.status == OrderStatus.DELIVERED && status == OrderStatus.CANCELLED) {
            throw new IllegalStateException("Нельзя отменить заказ, который уже доставлен.");
        }

        // Дополнительные проверки для других статусов, если необходимо
        if (this.status == OrderStatus.CANCELLED) {
            throw new IllegalStateException("Заказ уже отменен, статус нельзя изменить.");
        }

        // Если заказ в процессе, можно обновить статус
        if (this.status == OrderStatus.NEW && status == OrderStatus.IN_PROGRESS) {
            this.status = status; // Переход из NEW в IN_PROGRESS
        } else if (this.status == OrderStatus.IN_PROGRESS && (status == OrderStatus.DELIVERED || status == OrderStatus.CANCELLED)) {
            this.status = status; // Переход из IN_PROGRESS в DELIVERED или CANCELLED
        } else if (this.status == OrderStatus.IN_PROGRESS && status == OrderStatus.NEW) {
            throw new IllegalStateException("Нельзя вернуть статус заказа в NEW из IN_PROGRESS.");
        } else {
            throw new IllegalArgumentException("Неправильный переход статуса.");
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "status=" + status +
                '}';
    }
}
