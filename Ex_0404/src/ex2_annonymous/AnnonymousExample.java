package ex2_annonymous;

interface buttonClickListener{
	public void click();
}

public class AnnonymousExample {

		public class Button {
			private buttonClickListener listener;
			
			public void setButtonListener(buttonClickListener listener) {
				this.listener = listener;
			}
			
			// 버튼클릭 기능
			public void click() {
				if(listener != null) {
					this.listener.click();
				}
			}
		}
		public static void main(String[] args) {
			AnnonymousExample exam = new AnnonymousExample();
			AnnonymousExample.Button button = exam.new Button();
			button.setButtonListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
			}
		});
			// 버튼을 누름
			button.click();
	}
}
