package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Enum.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;

	private OrderStatus status;

	private Client client;

	private List<OrderItem> itens = new ArrayList<>();

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {

		this.moment = moment;
		this.status = status;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItem() {
		return itens;
	}

	// public void setItem(List<OrderItem> item) {
	// this.item = item; //}

	public void addItem(OrderItem item) {
		itens.add(item);

	}

	public void removerItem(OrderItem item) {
		itens.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrderItem x : itens) {
			sum = sum + x.subTotal();

		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment:" + sdf.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order itens:\n");
		for (OrderItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		
		return sb.toString();

	}

}
