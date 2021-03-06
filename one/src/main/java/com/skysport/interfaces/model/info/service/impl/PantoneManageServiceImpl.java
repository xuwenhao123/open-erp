package com.skysport.interfaces.model.info.service.impl;

import com.skysport.core.bean.page.DataTablesInfo;
import com.skysport.core.bean.system.SelectItem2;
import com.skysport.interfaces.bean.info.PantoneInfo;
import com.skysport.interfaces.mapper.develop.PantoneMapper;
import com.skysport.interfaces.model.info.service.IPantoneManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangjh on 2015/6/4.
 */
@Service("pantoneManageService")
public class PantoneManageServiceImpl implements IPantoneManageService {
    @Resource(name = "pantoneManageDao")
    private PantoneMapper pantoneManageDao;

    @Override
    public int listPantoneInfosCounts() {
        return pantoneManageDao.listInfosCounts();
    }

    @Override
    public int listFilteredPantoneInfosCounts(DataTablesInfo dataTablesInfo) {
        return pantoneManageDao.listFilteredInfosCounts(dataTablesInfo);
    }

    @Override
    public List<PantoneInfo> searchPantoneInfos(DataTablesInfo dataTablesInfo) {
        return pantoneManageDao.searchInfos(dataTablesInfo);
    }

    @Override
    public void edit(PantoneInfo pantoneInfo) {
        pantoneManageDao.updateInfo(pantoneInfo);
    }

    @Override
    public PantoneInfo queryPantoneInfoByPantoneId(String pantoneId) {
        return pantoneManageDao.queryInfo(pantoneId);
    }

    @Override
    public void add(PantoneInfo pantoneInfo) {
        pantoneManageDao.add(pantoneInfo);
    }

    @Override
    public void del(String pantoneId) {
        pantoneManageDao.del(pantoneId);
    }

    @Override
    public List<SelectItem2> querySelectList(String name) {
        return pantoneManageDao.querySelectList(name);
    }
}
