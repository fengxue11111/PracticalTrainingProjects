package com.freecoder.web.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Table {
    private Integer tableID;
    private String restID;
    private String tableName;
    private Integer tableLimit;
    private Integer tableUse;
    private String tableType;
    private String tableStatus;
}
