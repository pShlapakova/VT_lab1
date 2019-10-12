package main.objects;

public final class Attraction
        extends Infrastructure
        implements Comparable<Attraction> {
    private AttractionType type;
    private byte visitorsLove;
    private int rideTime;
    private int ticketPrice;

    public Attraction() {
        super();
        type = AttractionType.NO_TYPE;
        visitorsLove = 50;
        rideTime = 0;
    }

    public AttractionType getType() {
        return type;
    }

    public void setType(AttractionType type) {
            this.type = type;
    }

    public byte getVisitorsLove() {
        return visitorsLove;
    }

    public void setVisitorsLove(byte visitorsLove) {
        if ((visitorsLove >= 0) && (visitorsLove <= 100))
            this.visitorsLove = visitorsLove;
    }

    public int getRideTime() {
        return rideTime;
    }

    public void setRideTime(int rideTime) {
        if (rideTime > 0)
            this.rideTime = rideTime;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        if (ticketPrice >= 0)
            this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj != null) && (obj.getClass() == this.getClass())) {
            Attraction anotherAttraction = (Attraction)obj;
            if ((this.getName() == anotherAttraction.getName()) &&
                    (this.type == anotherAttraction.type))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 37*this.getName().hashCode() + this.type.hashCode();
    }

    @Override
    public String toString() {
        return "Attraction " + this.getName() + "\n   type: " + this.type +
                "\n   price of the ticket: " + this.ticketPrice +
                "\n rank: " + this.visitorsLove;
    }

    @Override
    public int compareTo(Attraction anotherAttraction) {
        return this.getName().compareTo(anotherAttraction.getName());
    }
}
