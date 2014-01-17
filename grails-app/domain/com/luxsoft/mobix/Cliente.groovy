package com.luxsoft.mobix

import com.luxsoft.cfdi.CFDIUtils;


class Cliente {
	
	String clave
	String nombre
	String rfc
	
	Direccion direccion
	
	Date dateCreated
	Date lastUpdated
	
	static embedded = ['direccion']

    static constraints = {
		clave(blank:false,maxSize:20,unique:true)
		nombre(blank:false,maxSize:255,unique:true)
		rfc(blank:false,minSize:12,maxSize:13)
		direccion(nullable:false)
    }
	
	String toString(){
		return "$nombre ($clave)"
	}
	
}
