package DTO;

public class LabParameters {
    private int numProducers;
    private int numConsumers;
    private int numToProducePerProducer;
    private int numToConsumePerConsumer;
    private boolean randomProducers;
    private boolean randomConsumers;
    private int staticSleepValueProducers;
    private int staticSleepValueConsumers;
    private int randomMaxTimeToProduce;
    private int randomMaxTimeToConsume;

    public LabParameters(int numConsumers,
                         int numProducers,
                         boolean randomProducers,
                         boolean randomConsumers,
                         int randomMaxTimeToConsume,
                         int randomMaxTimeToProduce,
                         int staticSleepValueConsumers,
                         int staticSleepValueProducers,
                         int numToConsumePerConsumer,
                         int numToProducePerProducer){
        this.randomProducers = randomProducers;
        this.randomConsumers = randomConsumers;
        this.randomMaxTimeToProduce = randomMaxTimeToProduce;
        this.randomMaxTimeToConsume = randomMaxTimeToConsume;
        this.staticSleepValueProducers = staticSleepValueProducers;
        this.staticSleepValueConsumers = staticSleepValueConsumers;
        this.numConsumers = numConsumers;
        this.numProducers = numProducers;
        this.numToConsumePerConsumer = numToConsumePerConsumer;
        this.numToProducePerProducer = numToProducePerProducer;
    }

    public boolean isRandomProducers() {
        return randomProducers;
    }

    public void setRandomProducers(boolean randomProducers) {
        this.randomProducers = randomProducers;
    }

    public boolean isRandomConsumers() {
        return randomConsumers;
    }

    public void setRandomConsumers(boolean randomConsumers) {
        this.randomConsumers = randomConsumers;
    }

    public int getRandomMaxTimeToProduce() {
        return randomMaxTimeToProduce;
    }

    public void setRandomMaxTimeToProduce(int randomMaxTimeToProduce) {
        this.randomMaxTimeToProduce = randomMaxTimeToProduce;
    }

    public int getRandomMaxTimeToConsume() {
        return randomMaxTimeToConsume;
    }

    public void setRandomMaxTimeToConsume(int randomMaxTimeToConsume) {
        this.randomMaxTimeToConsume = randomMaxTimeToConsume;
    }

    public int getStaticSleepValueProducers() {
        return staticSleepValueProducers;
    }

    public void setStaticSleepValueProducers(int staticSleepValueProducers) {
        this.staticSleepValueProducers = staticSleepValueProducers;
    }

    public int getStaticSleepValueConsumers() {
        return staticSleepValueConsumers;
    }

    public void setStaticSleepValueConsumers(int staticSleepValueConsumers) {
        this.staticSleepValueConsumers = staticSleepValueConsumers;
    }

    public int getNumProducers() {
        return numProducers;
    }

    public void setNumProducers(int numProducers) {
        this.numProducers = numProducers;
    }

    public int getNumConsumers() {
        return numConsumers;
    }

    public void setNumConsumers(int numConsumers) {
        this.numConsumers = numConsumers;
    }

    public int getNumToProducePerProducer() {
        return numToProducePerProducer;
    }

    public void setNumToProducePerProducer(int numToProducePerProducer) {
        this.numToProducePerProducer = numToProducePerProducer;
    }

    public int getNumToConsumePerConsumer() {
        return numToConsumePerConsumer;
    }

    public void setNumToConsumePerConsumer(int numToConsumePerConsumer) {
        this.numToConsumePerConsumer = numToConsumePerConsumer;
    }
}
