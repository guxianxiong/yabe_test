package controllers;

import play.mvc.With;

/**
 * Created by guxianxiong on 2018/4/8.
 */
@Check("admin")
@With(Secure.class)
public class Comments extends CRUD {
}
