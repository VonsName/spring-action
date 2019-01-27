package com.von.spaction.springmvc;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 21:59
 */
@Service
public class SpittleRepositoryImpl implements SpittleRepository{
    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return null;
    }
}
