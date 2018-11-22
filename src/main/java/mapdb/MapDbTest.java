package mapdb;

import org.mapdb.DB;
import org.mapdb.DBMaker;

import java.util.concurrent.ConcurrentMap;

/**
 * Created by wangdecheng on 19/07/2018.
 */
public class MapDbTest {

    public static void main(String[] args){
        DB db = DBMaker.memoryDB().make();
        ConcurrentMap map = db.hashMap("map").createOrOpen();
        map.put("something", "here");
    }
}
