
/*
enum Destination {
    ISTANBUL,
    ADANA,
    IZMIR
}
class Passenger {
    private String name;
    private Destination destination;

    public Passenger(String name, Destination destination) {
        this.name = name;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    class Bus {
        private static final int CAPACITY = 50;
        private int passengerCount;
        public Bus() {
            this.passengerCount = 0;
        }
        private Destination destination;
        private Passenger[] passengers;

        public Bus(Destination destination,Passenger[] passengers){
            this.destination=destination;
        }
        //get set destination
        public Destination getDestination(){
        return destination;
        }
        public void setDestination(Destination destination) {
            this.destination = destination;
        }
        //get set destination
        public Passenger
    }



        public void insertPassenger(Passenger passenger) {

            if(passengerCount==CAPACITY){
                System.out.println("Bus is full.");
            }
            else if(passenger.getDestination()==destination){
                passenger
           }
           /* if (passengerCount < CAPACITY) {
                //get destination busın nereye gittiğini yaz
                //passanger
                if(passenger.getDestination() !=null){
                    System.out.println(passanger.getName());
                }
                passengerCount++;
                System.out.println(passenger.getName() + " this passanger inserted");
            } else {
                System.out.println("Bus is full.");
            }
        }
*/
/*
        public class Main {
            public void main(String[] args) {
                Bus bus1 = new Bus();
                Bus bus2 = new Bus();

                Passenger passenger = new Passenger("Ayşe", Destination.ADANA);
                Passenger passanger2 = new Passenger("Fatma", Destination.ISTANBUL);
                Passenger passanger3 = new Passenger("Hayriye", Destination.IZMIR);

                bus1.insertPassenger(passenger);
                bus2.insertPassenger(passanger2);

                // bus1.insertPassenger(new Passenger("Simay",Destination.ADANA));

            }
        }
    }
}
//eğer tekrar yazmak istersen 443
*/
// Enum sınıfı
enum Destination {
    ISTANBUL,
    ADANA,
    ANKARA
}

// Passenger sınıfı
class Passenger {
    private String name;
    private Destination destination;

    public Passenger(String name, Destination destination) {
        this.name = name;
        this.destination = destination;
    }

    // Getter ve setter metotları
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}

// Bus sınıfı
class Bus {
    private Destination busDestination;
    private Passenger[] passengers;
    private int capacity;
    private int passengerCount;

    public Bus(Destination busDestination, int capacity) {
        this.busDestination = busDestination;
        this.capacity = capacity;
        this.passengers = new Passenger[capacity];
        this.passengerCount = 0;
    }

    // Yolcu eklemek için metot
    public void insertPassenger(Passenger passenger) {
        if (passengerCount < capacity) {
            if (busDestination == passenger.getDestination()) {
                passengers[passengerCount] = passenger;
                passengerCount++;
                System.out.println(passenger.getName() + " is successfully added to the bus to " + busDestination);
            } else {
                System.out.println("Cannot add passenger " + passenger.getName() + " to the bus. Destination mismatch.");
            }
        } else {
            System.out.println("Cannot add passenger " + passenger.getName() + ". Bus is full.");
        }
    }

    // Getter ve setter metotları
    public Destination getBusDestination() {
        return busDestination;
    }

    public void setBusDestination(Destination busDestination) {
        this.busDestination = busDestination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus(Destination.ADANA, 3);

        bus1.insertPassenger(new Passenger("Ali", Destination.ADANA));
        bus1.insertPassenger(new Passenger("Ayşe", Destination.ANKARA));
        bus1.insertPassenger(new Passenger("Mehmet", Destination.ISTANBUL));
        bus1.insertPassenger(new Passenger("Fatma", Destination.ANKARA));

        // Kapasite dolduğu için aşağıdaki yolcu eklemeleri başarısız olacaktır
        bus1.insertPassenger(new Passenger("Ahmet", Destination.ADANA));
        bus1.insertPassenger(new Passenger("Zeynep", Destination.ANKARA));
    }
}
