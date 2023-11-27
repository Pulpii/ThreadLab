package DTO;

import javax.swing.*;

public class LabResults {
    private int millisecondsToCreateThreadObjects = 0;
    private int millisecondsToStartThreads = 0;
    private int millisecondsToProcessConsumers = 0;
    private int millisecondsToProcessProductors = 0;
    private int amountProducedItems = 0;
    private int amountConsumedItems = 0;
    private int amountThreadsProductorsProcessing = 0;
    private int amountThreadsProductorsEnded = 0;
    private int amountThreadsProductorsPending = 0;
    private int amountThreadsConsumersProcessing = 0;
    private int amountThreadsConsumersEnded = 0;
    private int amountThreadsConsumersPending = 0;

    public LabResults() {
    }

    public LabResults(int millisecondsToCreateThreadObjects, int millisecondsToStartThreads, int millisecondsToProcessConsumers, int millisecondsToProcessProductors, int amountProducedItems, int amountConsumedItems, int amountThreadsProductorsProcessing, int amountThreadsProductorsEnded, int amountThreadsProductorsPending, int amountThreadsConsumersProcessing, int amountThreadsConsumersEnded, int amountThreadsConsumersPending) {
        this.millisecondsToCreateThreadObjects = millisecondsToCreateThreadObjects;
        this.millisecondsToStartThreads = millisecondsToStartThreads;
        this.millisecondsToProcessConsumers = millisecondsToProcessConsumers;
        this.millisecondsToProcessProductors = millisecondsToProcessProductors;
        this.amountProducedItems = amountProducedItems;
        this.amountConsumedItems = amountConsumedItems;
        this.amountThreadsProductorsProcessing = amountThreadsProductorsProcessing;
        this.amountThreadsProductorsEnded = amountThreadsProductorsEnded;
        this.amountThreadsProductorsPending = amountThreadsProductorsPending;
        this.amountThreadsConsumersProcessing = amountThreadsConsumersProcessing;
        this.amountThreadsConsumersEnded = amountThreadsConsumersEnded;
        this.amountThreadsConsumersPending = amountThreadsConsumersPending;
    }

    public int getMillisecondsToCreateThreadObjects() {
        return millisecondsToCreateThreadObjects;
    }

    public void setMillisecondsToCreateThreadObjects(int millisecondsToCreateThreadObjects) {
        this.millisecondsToCreateThreadObjects = millisecondsToCreateThreadObjects;
    }

    public int getMillisecondsToStartThreads() {
        return millisecondsToStartThreads;
    }

    public void setMillisecondsToStartThreads(int millisecondsToStartThreads) {
        this.millisecondsToStartThreads = millisecondsToStartThreads;
    }

    public int getMillisecondsToProcessConsumers() {
        return millisecondsToProcessConsumers;
    }

    public void setMillisecondsToProcessConsumers(int millisecondsToProcessConsumers) {
        this.millisecondsToProcessConsumers = millisecondsToProcessConsumers;
    }

    public int getMillisecondsToProcessProductors() {
        return millisecondsToProcessProductors;
    }

    public void setMillisecondsToProcessProductors(int millisecondsToProcessProductors) {
        this.millisecondsToProcessProductors = millisecondsToProcessProductors;
    }

    public int getAmountProducedItems() {
        return amountProducedItems;
    }

    public void setAmountProducedItems(int amountProducedItems) {
        this.amountProducedItems = amountProducedItems;
    }

    public int getAmountConsumedItems() {
        return amountConsumedItems;
    }

    public void setAmountConsumedItems(int amountConsumedItems) {
        this.amountConsumedItems = amountConsumedItems;
    }

    public int getAmountThreadsProductorsProcessing() {
        return amountThreadsProductorsProcessing;
    }

    public void setAmountThreadsProductorsProcessing(int amountThreadsProductorsProcessing) {
        this.amountThreadsProductorsProcessing = amountThreadsProductorsProcessing;
    }

    public int getAmountThreadsProductorsEnded() {
        return amountThreadsProductorsEnded;
    }

    public void setAmountThreadsProductorsEnded(int amountThreadsProductorsEnded) {
        this.amountThreadsProductorsEnded = amountThreadsProductorsEnded;
    }

    public int getAmountThreadsProductorsPending() {
        return amountThreadsProductorsPending;
    }

    public void setAmountThreadsProductorsPending(int amountThreadsProductorsPending) {
        this.amountThreadsProductorsPending = amountThreadsProductorsPending;
    }

    public int getAmountThreadsConsumersProcessing() {
        return amountThreadsConsumersProcessing;
    }

    public void setAmountThreadsConsumersProcessing(int amountThreadsConsumersProcessing) {
        this.amountThreadsConsumersProcessing = amountThreadsConsumersProcessing;
    }

    public int getAmountThreadsConsumersEnded() {
        return amountThreadsConsumersEnded;
    }

    public void setAmountThreadsConsumersEnded(int amountThreadsConsumersEnded) {
        this.amountThreadsConsumersEnded = amountThreadsConsumersEnded;
    }

    public int getAmountThreadsConsumersPending() {
        return amountThreadsConsumersPending;
    }

    public void setAmountThreadsConsumersPending(int amountThreadsConsumersPending) {
        this.amountThreadsConsumersPending = amountThreadsConsumersPending;
    }
}
