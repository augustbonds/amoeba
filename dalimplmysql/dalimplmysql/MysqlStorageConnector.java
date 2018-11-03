package com.augustbonds.dalimplmysql.dalimplmysql;

import io.hops.StorageConnector;
import io.hops.exception.StorageException;

import java.util.Properties;

public class MysqlStorageConnector implements StorageConnector{
    @Override
    public void setConfiguration(Properties conf) throws StorageException {

    }

    @Override
    public void beginTransaction() throws StorageException {

    }

    @Override
    public void commit() throws StorageException {

    }

    @Override
    public void rollback() throws StorageException {

    }

    @Override
    public boolean formatAllStorageNonTransactional() throws StorageException {
        return false;
    }

    @Override
    public boolean formatYarnStorageNonTransactional() throws StorageException {
        return false;
    }

    @Override
    public boolean formatHDFSStorageNonTransactional() throws StorageException {
        return false;
    }

    @Override
    public boolean formatStorage() throws StorageException {
        return false;
    }

    @Override
    public boolean formatYarnStorage() throws StorageException {
        return false;
    }

    @Override
    public boolean formatHDFSStorage() throws StorageException {
        return false;
    }

    @Override
    public boolean isTransactionActive() throws StorageException {
        return false;
    }

    @Override
    public void stopStorage() throws StorageException {

    }

    @Override
    public void readLock() throws StorageException {

    }

    @Override
    public void writeLock() throws StorageException {

    }

    @Override
    public void readCommitted() throws StorageException {

    }

    @Override
    public void setPartitionKey(Class className, Object key) throws StorageException {

    }

    @Override
    public void dropAndRecreateDB() throws StorageException {

    }

    @Override
    public void flush() throws StorageException {

    }

    @Override
    public String getClusterConnectString() {
        return null;
    }

    @Override
    public String getDatabaseName() {
        return null;
    }

    @Override
    public boolean formatStorage(Class[] das) throws StorageException {
        return false;
    }

    @Override
    public Object obtainSession() throws StorageException {
        return null;
    }
}
