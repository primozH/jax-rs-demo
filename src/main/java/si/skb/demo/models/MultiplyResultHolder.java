package si.skb.demo.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "arithmetic")
public class MultiplyResultHolder {
    private int first;
    private int second;
    private int result;
    private String operation = "multiply";

    public MultiplyResultHolder() {}

    public MultiplyResultHolder(int first, int second, int result) {
        this.first = first;
        this.second = second;
        this.result = result;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public int getResult() {
        return result;
    }

    public String getOperation() {
        return operation;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}