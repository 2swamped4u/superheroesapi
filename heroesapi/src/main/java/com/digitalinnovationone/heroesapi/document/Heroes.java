package com.digitalinnovationone.heroesapi.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@DynamoDBTable(tableName = "Heroes_Table_Demo")
public class Heroes {
    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    @DynamoDBAttribute(attributeName = "names")
    private String name;
    @DynamoDBAttribute(attributeName = "universe")
    private String universe;
    @DynamoDBAttribute(attributeName = "filmes")
    private int filmes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public void setFilmes(int filmes) {
        this.filmes = filmes;
    }
    public Heroes(String id, String name, String universe, int filmes){
        this.id=id;
        this.name=name;
        this.universe=universe;
        this.filmes=filmes;
    }

}
