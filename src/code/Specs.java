package code;

public class Specs {
	// 仕様：単語情報を出力できること。
	// プログラムが実行されたら、なんらかの形で「上手」と出力する。
	public void output() {
		FileWordsReader wordsReadrer = new FileWordsReader();
		System.out.println(wordsReadrer.settup().getFirstWord()); //FIXME:未検証
	}
}
