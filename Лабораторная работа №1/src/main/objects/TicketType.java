package main.objects;

public enum TicketType {
    ADULT, CHILD, STUDENT, FAMILY;

    public double getRate() {
        switch (this) {
            case CHILD:
                return 0.5;
            case STUDENT:
                return 0.8;
            case FAMILY:
                return 2.5;
            default:
                return 1;
        }
    }
}
