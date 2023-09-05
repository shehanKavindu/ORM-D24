package lk.ijse.hostel.dao;

import java.util.ArrayList;
import java.util.ArrayList;

public interface SQLUtil<T> extends SuperDAO{
boolean save(T entity);
boolean delete(T entity);
Boolean update(T entity);
//ArrayList<T> get();
}

