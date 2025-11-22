class yt {
    private String ChannelName;
    private int SubscriberCount;
    private String password;  // private password

    public yt(String ChannelName, int SubscriberCount, String password) {
        this.ChannelName = ChannelName;
        this.SubscriberCount = SubscriberCount;
        this.password = password;
    }

    public void getName() {
        System.out.println("Channel Name: " + ChannelName);
    }

    public void getSubscriberCount() {
        System.out.println("Subscribers: " + SubscriberCount);
    }

    public void increaseSubscriber(String pass) {
        if (pass.equals(password)) {
            SubscriberCount++;
            System.out.println("Subscriber added successfully!");
        } else {
            System.out.println("Incorrect Password ");
        }
    }

    public void decreaseSubscriber(String pass) {
        if (pass.equals(password)) {
            if (SubscriberCount > 0) {
                SubscriberCount--;
                System.out.println("Subscriber removed successfully!");
            } else {
                System.out.println("No subscribers to remove!");
            }
        } else {
            System.out.println("Incorrect Password ");
        }
    }
}

class y {
    public static void main(String[] args) {

        yt y1 = new yt("Pranya", 5985743, "1234ABC");
        yt y2 = new yt("hakunamatata", 190907657, "462ABC");
        yt y3 = new yt("zuzuzuh", 16291723, "4321ABC");

        y1.getName();
        y1.getSubscriberCount();
        y1.increaseSubscriber("wrongpass");
        y1.increaseSubscriber("1234ABC");
        y1.getSubscriberCount();
        y1.decreaseSubscriber("1234ABC");
        y1.getSubscriberCount();

        y2.getName();
        y2.getSubscriberCount();
        y2.increaseSubscriber("wrongpass");
        y2.increaseSubscriber("462ABC");
        y2.getSubscriberCount();
        y2.decreaseSubscriber("462ABC");
        y2.getSubscriberCount();

        y3.getName();
        y3.getSubscriberCount();
        y3.increaseSubscriber("wrongpass");
        y3.increaseSubscriber("4321ABC");
        y3.getSubscriberCount();
        y3.decreaseSubscriber("4321ABC");
        y3.getSubscriberCount();
    }
}
