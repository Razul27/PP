package org.phone;

public class InternalStorage {
private void processorName() {
	System.out.println("Processor Name - IOS");
}
private void ramSize() {
	System.out.println("Ram Size-6GB");
}
public static void main(String[] args) {
	InternalStorage i=new InternalStorage();
	i.processorName();
	i.ramSize();
	ExternalStorage e=new ExternalStorage();
	e.size();
	System.out.println();
	System.out.println();
}
}
