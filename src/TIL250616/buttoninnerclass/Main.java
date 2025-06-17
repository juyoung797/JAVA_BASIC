package TIL250616.buttoninnerclass;

class Button {
    interface OnClickListener {
        void onClick();
    }
    private OnClickListener listener;

    public void setOnclickListener(OnClickListener listener) {
        this.listener = listener;
    }
    public void click() {
        if (listener != null) {
            listener.onClick();
        }
    }
    // OnclickListener를 구현한 ClickHandler Innerclass
    private class ClickHandler implements OnClickListener {
        public void onClick() {
            System.out.println("Button is Clicked");
        }
    }
    public void simulateClick() {
        setOnclickListener(new ClickHandler());
        click();
    }
}
public class Main {
    public static void main(String[] args) {
        Button button = new Button();
        button.simulateClick();
    }
}
