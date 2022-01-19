package Dao;

import java.util.List;

public abstract class EdusysDao<E,K> {

    abstract public void insert(E entity);

    abstract public void delete(K entity);

    abstract public void update(E entity);

    abstract public List<E> SelectALL();

    abstract public E SelectByID(K entity);

    abstract protected List<E> selectBySQL(String sql, Object... args);
}
