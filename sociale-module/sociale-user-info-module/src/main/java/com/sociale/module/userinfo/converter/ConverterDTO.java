package com.sociale.module.userinfo.converter;

public interface ConverterDTO<Entity, Request, Response> {

    Response toResponseSmart(Entity model);

    Entity toEntitySmart(Request request);

    Response toResponseFast(Entity model);

    Entity toEntityFast(Request request);

}

