package java2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private Cliente cliente;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private List<OrderItem> itens = new ArrayList<OrderItem>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(OrderItem item){
        itens.add(item);
    }
    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem it : itens) {
            sum = sum + it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Order moment: ");
            sb.append(sdf.format(moment) + "\n");
            sb.append("order status: ");
            sb.append(status+ "\n");
            sb.append("Client: ");
            sb.append(cliente + "\n");
            sb.append("Order items: \n ");
            for (OrderItem item : itens) {
                sb.append((item + " \n"));
            }
            sb.append("Total price: $ ");
            sb.append (String.format("%.2f", total()));
            return sb.toString(); // converte no final para string

        }
    }






