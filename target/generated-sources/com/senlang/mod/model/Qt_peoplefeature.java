package com.senlang.mod.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * Qt_peoplefeature is a Querydsl query type for t_peoplefeature
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class Qt_peoplefeature extends EntityPathBase<t_peoplefeature> {

    private static final long serialVersionUID = 1922383994L;

    public static final Qt_peoplefeature t_peoplefeature = new Qt_peoplefeature("t_peoplefeature");

    public final StringPath businessid = createString("businessid");

    public final StringPath cardnumber = createString("cardnumber");

    public final NumberPath<Integer> contorltype = createNumber("contorltype", Integer.class);

    public final DateTimePath<java.util.Date> createtime = createDateTime("createtime", java.util.Date.class);

    public final ArrayPath<byte[], Byte> Feature = createArray("Feature", byte[].class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath picpath = createString("picpath");

    public final StringPath remark = createString("remark");

    public final NumberPath<Integer> sex = createNumber("sex", Integer.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public Qt_peoplefeature(String variable) {
        super(t_peoplefeature.class, forVariable(variable));
    }

    public Qt_peoplefeature(Path<? extends t_peoplefeature> path) {
        super(path.getType(), path.getMetadata());
    }

    public Qt_peoplefeature(PathMetadata metadata) {
        super(t_peoplefeature.class, metadata);
    }

}

