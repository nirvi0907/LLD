package locker.src.controllers;

import locker.src.allocate.Allocator;
import locker.src.allocate.RandomAllocate;
import locker.src.model.*;
import locker.src.model.Package;
import locker.src.services.AllocationService;

import java.lang.System;
import java.util.HashMap;
import java.util.List;

public class Allocate {
     public Locker allocate(IUser user, Package packageObj ){
         AllocationService allocationService= new AllocationService();
         Locker locker = null;
         try {
             locker = allocationService.allocate(user, packageObj);
         }catch(Exception e){
             System.out.println(e);
         }
         return locker;

     }

}
