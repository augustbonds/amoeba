package com.augustbonds.dalimplmysql.dalimplmysql;

import io.hops.DalStorageFactory;
import io.hops.StorageConnector;
import io.hops.exception.StorageInitializtionException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Properties;

public class DalStorageFactoryMysql implements DalStorageFactory {

    @Override
    public void setConfiguration(Properties conf) throws StorageInitializtionException {
    }

    @Override
    public StorageConnector getConnector() {
        return new MysqlStorageConnector();
    }

    @Override
    public EntityDataAccess getDataAccess(Class type) {
        return null;
    }

    @Override
    public boolean hasResources(double threshold) {
        return false;
    }
}
