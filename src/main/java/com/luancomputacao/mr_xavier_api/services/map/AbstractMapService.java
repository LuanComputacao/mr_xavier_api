package com.luancomputacao.mr_xavier_api.services.map;

import java.util.HashMap;
import java.util.Map;

public class AbstractMapService<T, ID>{

    protected Map<ID, T> map = new HashMap<>();
}
