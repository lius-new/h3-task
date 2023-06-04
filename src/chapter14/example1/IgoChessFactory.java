package chapter14.example1;

import java.util.HashMap;
import java.util.Objects;

public class IgoChessFactory {
    private static final IgoChessFactory igoChessFactory = new IgoChessFactory();
    private static HashMap<String, Object> hashMap;

    public IgoChessFactory() {
        hashMap = new HashMap<>();
        IgoChessMan black, white;
        black = new BlackIgoChessMan();
        white = new WhiteIgoChessMan();
        hashMap.put("b", black);
        hashMap.put("w", white);
    }

    public static IgoChessFactory getInstance() {
        return igoChessFactory;
    }

    public IgoChessMan getIgoChessMan(String key) {
        return (IgoChessMan) hashMap.get(key);
    }
}
