package bak;

import java.util.List;

public interface CommonMapper<T> {
    public T selectByPrimaryKey(Integer id);
    public List<T> selectByExample();
}
