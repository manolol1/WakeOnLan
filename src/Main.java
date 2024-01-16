public class Main {
    public static void main(String[] args) {
        MagicPacketSender packetSender = new MagicPacketSender();

        if (args.length < 1) {
            System.out.println("Please specify a mac address!");
            System.exit(1);
        }

        if (args.length == 2) {
            packetSender.send(args[1], args[0]);
        } else {
            packetSender.send("255.255.255.255", args[0]);
        }
    }
}