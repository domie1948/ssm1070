//Powered By if, Since 2014 - 2020

package com.zsCat.web.dynamictask.mapper;

import com.github.abel533.mapper.Mapper;
import com.zsCat.web.dynamictask.model.MaintainTaskDefinition;

import java.util.List;
import java.util.Map;

/**
 * 
 * @author if
 */

public interface MaintainTaskDefinitionMapper extends Mapper<MaintainTaskDefinition> {


	public List<MaintainTaskDefinition> findMaintainTaskDefinitionList(Map<String, Object> params);
   

}
