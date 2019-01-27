package com.von.spaction.springmvc;

import java.util.List;

/**
 * @author : vons
 * @version : 1.0
 * @date : 2019/1/27 21:23
 */
public interface SpittleRepository {
    List<Spittle> findSpittles(long max,int count);
}
