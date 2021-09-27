package chap06;

public class DmCellPhone extends CellPhone{
    int channel;

    public DmCellPhone(String model, String color, int channel) {
        super(model, color);
        this.channel = channel;
    }

    void changeChannel(int channel) {
        this.channel = channel;
        System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
    }

    void turnOnDmb() {
        System.out.println("채널" + channel + "번 DMB방송 수신을 시작합니다.");
    }

    void turnOffDmb() {
        System.out.println("DMB방송 수신을 멈춥니다.");
    }
}
