package top.cafebabe.fragment.manger.splitter;

import top.cafebabe.fragment.exception.ObjectInitException;

import java.io.InputStream;

/**
 * @author cafababe
 */
public interface SplitterFactory {
    Splitter getInstance(InputStream is) throws ObjectInitException;
}
