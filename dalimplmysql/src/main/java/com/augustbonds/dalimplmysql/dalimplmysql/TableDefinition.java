package com.augustbonds.dalimplmysql.dalimplmysql;

public enum TableDefinition {
    HDFS_INODES("HDFS_INODES", new String[]{"parent_id", "id"});

    private String name;
    private String[] columns;

    private TableDefinition(String name, String[] columns){
        this.name = name;
        this.columns = columns;
    }
    public String[] getColumns(){
        return columns;
    }

    public String getName(){
        return name;
    }


}
