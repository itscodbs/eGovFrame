package ch05.ex02.home2;

public class MemoMain {
	public static void main(String[] args) {
		Memo memo = new Memo();
		String msg = null;
		String from = null;
		System.out.print("메모지에 남길 메모를 작성해주세요.\n>> "); memo.writeMsg(msg);
		System.out.print("메모를 남기신 분은 누구인가요?\n>> "); memo.writeFrom(from);
		System.out.printf("\n[메시지 내용] %s from %s", memo.getMsg(), memo.getFrom());
	}
}