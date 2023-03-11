public abstract class EngineTransport extends Transport implements Diagnostable {
    public EngineTransport (String modelName, int wheelCount) {
        super (modelName, wheelCount);
        }
        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }

    @Override
    public void service() {
        super.service();
        checkEngine();
        //обслужить колеса
        //обслужить двигатель
    }
}
