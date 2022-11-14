package task2;

import task2.Transport.Bus;
import task2.Transport.Car;
import task2.Transport.Transport;
import task2.Transport.Truck;

public class Main {
    public static void main(String[] args) {

        Bus volgaBus = new Bus("ВолгаБус", "Воробей", 4.6);
        Bus hyundai = new Bus("Хендай", "Жук", 4.2);
        Bus scania = new Bus("Скания", "Орел", 4.8);
        Bus volvo = new Bus("Вольво", "Бык", 4.1);

        System.out.println(volgaBus);
        System.out.println(hyundai);
        System.out.println(scania);
        System.out.println(volvo);
        System.out.println();

        System.out.println(volgaBus.pitStop());
        volgaBus.setBestLapTime(15.8);
        System.out.println(volgaBus.bestLapTime());
        volgaBus.setMaxSpeed(37.94);
        System.out.println(volgaBus.maxSpeed());

        Car lada = new Car("Лада", "Веста", 1.6);
        Car kia = new Car("Киа", "Селт", 1.4);
        Car renault= new Car("Рено", "Логан", 1.5);
        Car skoda = new Car("Шкода", "Рапид", 1.8);

        System.out.println(lada);
        System.out.println(kia);
        System.out.println(renault);
        System.out.println(skoda);
        System.out.println();

        Truck kamaz = new Truck("Камаз", "Пушинка", 9.5);
        Truck dongfeng = new Truck("Донгфен", "Гайка", 9.4);
        Truck jac = new Truck("Джак", "Болт", 9.2);
        Truck gmc = new Truck("Джмс", "Отвертка", 9.7);

        System.out.println(kamaz);
        System.out.println(dongfeng);
        System.out.println(jac);
        System.out.println(gmc);

        diagnostics(
                lada, kia, renault, skoda,
                kamaz, dongfeng, jac,gmc,
                volgaBus, hyundai, scania, volvo
        );
    }

    private static void diagnostics(Transport... transports) {
        for (int i = 0; i < transports.length; i++) {
            if (!transports[i].diagnostics()) {
                throw new RuntimeException("Автомобить " + transports[i].getBrand()
                        + " " + transports[i].getModel() + " не прошел диагностику");
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}