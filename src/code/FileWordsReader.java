package code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileWordsReader {

	// データファイルはクラスと併置。UTF-8、CRLF区切り
	public static final String DataFile = "words.txt";
	public static final String DataFileCharset = "UTF-8";

	// 単語の格納
	private List<String> words = new ArrayList<>();

	/** データ準備用の初期化メソッド */
	public FileWordsReader settup() {
		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(getClass().getResourceAsStream(DataFile), DataFileCharset))) {
			words.clear();
			String line = null;
			while ( (line = reader.readLine()) != null ) {
				words.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace(); //FIXME:エラーハンドリングは暫定
		}
		return this;
	}

	/**
	 * 最初の単語を取得する
	 * @return 最初の単語。なければ null。
	 */
	public String getFirstWord() {
		return this.words.size() > 0 ? this.words.get(0) : null;
	}
}
