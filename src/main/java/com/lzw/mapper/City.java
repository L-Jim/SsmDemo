package com.lzw.mapper;

public class City {
	public City(String name,String code,String fatherNode)
	{
		setCityname(name);
		setCitycode(code);
		setFathernode(fatherNode);
	}
	City()
	{
		
	}

    private Long id;

    private String cityname;


    private String citycode;

    private String fathernode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getFathernode() {
        return fathernode;
    }

    public void setFathernode(String fathernode) {
        this.fathernode = fathernode;
    }
	@Override
	public String toString() {
		return "City [id=" + id + ", cityname=" + cityname + ", citycode=" + citycode + ", fathernode=" + fathernode
				+ "]";
	}
}