package com.dev.springbootmicroservice1inmueble.service;

import com.dev.springbootmicroservice1inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    void  deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmuebles();

}
