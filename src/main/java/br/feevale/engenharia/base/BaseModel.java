package br.feevale.engenharia.base;

import java.io.Serializable;

import org.springframework.data.domain.Persistable;

public abstract class BaseModel implements Serializable, Persistable<Long> {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean isNew() {
		return null == getId();
	}

}
