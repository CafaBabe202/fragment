package top.cafebabe.fragment.manger.integrator;

import top.cafebabe.fragment.exception.ObjectInitException;
import top.cafebabe.fragment.manger.memory.Memory;

/**
 * @author cafababe
 */
public interface IntegratorFactory {

    Integrator getInstance(Memory memory, String md5) throws ObjectInitException;

}
