package priv.yuan.service;

import com.github.pagehelper.PageInfo;
import priv.yuan.entity.Test;
import priv.yuan.vo.TestVo;

import java.util.List;
import java.util.Map;

/**
 * (Test)表服务接口
 *
 * @author makejava
 * @since 2020-04-01 15:00:13
 */
public interface TestService {

    /**
     * 通过ID查询单条数据
     *
     * @param
     * @return 实例对象
     */
    List<TestVo> queryById(Long userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Test> queryAllByLimit(int offset, int limit);


    /**
     * 查询全部数据
     * @return 对象列表
     */
    Map selectAll(Long id, Integer page, Integer limit);

    List<Test> queryAll();




    /**
     * 新增数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    Test insert(Test test);

    /**
     * 修改数据
     *
     * @param test 实例对象
     * @return 实例对象
     */
    Test update(Test test);

    /**
     * 通过主键删除数据
     *
     * @param testId 主键
     * @return 是否成功
     */
    boolean deleteById(Long testId);

}