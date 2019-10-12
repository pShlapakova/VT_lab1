package main.objects;

public final class Ticket
        implements Comparable<Ticket>{
    private int price;
    private TicketType type;
    private Attraction attraction;

    public Ticket() {
        price = attraction.getTicketPrice();
        type = TicketType.ADULT;
        attraction = null;
    }

    public int getPrice() {
        return price;
    }

    public TicketType getType() {
        return type;
    }

    public void setType(TicketType type) {
        this.type = type;
    }

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == this.getClass())) {
            Ticket anotherTicket = (Ticket)obj;
            if ((this.attraction == anotherTicket.attraction) &&
                    (this.type == anotherTicket.type) &&
                    (this.price == anotherTicket.price))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 37*(37*this.attraction.hashCode() + this.type.hashCode()) + this.price;
    }

    @Override
    public String toString() {
        return "Ticket\n   to: " + attraction.getName() + "\n   price: " +
                this.price + "\n   type: " + this.type;
    }

    @Override
    public int compareTo(Ticket anotherTicket) {
        return (int)Math.round(this.type.getRate() * this.price -
                anotherTicket.type.getRate() * anotherTicket.price);
    }
}
