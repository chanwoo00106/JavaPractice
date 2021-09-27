package chap06;

public class DmCellPhoneTest {
    public static void main(String[] args) {
        DmCellPhone dm = new DmCellPhone("자바폰", "검정", 10);
        System.out.println(dm.model);
        System.out.println(dm.color);
        System.out.println(dm.channel);

        dm.powerOn();
        dm.bell();
        dm.sendVoice("여보세요");
        dm.receiveVoice("여기는 마량입니다.");
        dm.sendVoice("ㅇㅇ");
        dm.hangUp();

        dm.changeChannel(12);
        dm.turnOffDmb();
    }
}
