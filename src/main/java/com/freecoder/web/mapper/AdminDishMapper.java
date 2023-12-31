package com.freecoder.web.mapper;

import com.freecoder.web.model.Dish;
import com.freecoder.web.model.DishCategory;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminDishMapper {

    List<Dish> getDishInfo(String restID,String dishName);

    boolean addDishInfo(Dish dish);

    boolean updateDishInfo(Dish dish);

    @Delete("delete from dish_info where dishID = #{dishID}")
    boolean deleteDishInfo(Integer dishID);

    @Select("select * from dish_info where restID = #{restID}")
    List<DishCategory> getDcInfo(String restID);
}
