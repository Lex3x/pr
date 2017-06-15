package service;

import dao.RecordDao;
import model.Record;

import java.util.List;

/**
 * Created by Tatsiana on 11.06.17.
 */
public class RecordService {

    private RecordDao recordDao;

    public RecordService() {
        super();
        recordDao = new RecordDao();
    }

    public void addRecord(Record record) {
        recordDao.addRecord(record);
    }

    public void deleteRecord(int recordId) {
        recordDao.deleteRecord(recordId);
    }

    public void updateRecord(Record record) {
        recordDao.updateRecord(record);
    }

    public List<Record> getAllRecords() {
        return recordDao.getAllRecords();
    }

    public Record getRecordById(int recordId) {
        return recordDao.getRecordById(recordId);
    }

    public int getMaxId() {
        List<Record> recordList = recordDao.getAllRecords();
        int max = 0;
        for (Record record : recordList) {
            if (max < record.getIdRecord()) {
                max = record.getIdRecord();
            }
        }
        return max;
    }

}
