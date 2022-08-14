package com.example.springintegration.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity( name = "myRecord" )
@Table( name = "MY_RECORD" )
public class MyRecord extends AbstractEntity {

    @Column( name = "STRING_RECORD" )
    private String record;

    @Column( name = "MY_RECORD_FLAG" )
    private Boolean myRecordFlag;

}
