//package dev;
//
//public class EcommerceService {
//
//    boolean discountFlag=true;
//
//    public Order placeOrder(Order order){
//        //logic to process the order
//        //code added by developer 2
//        if(discountFlag){
//            if(order.getPrice()>5000){
//                //add 10% discount
//                double discountAmount=0.10 * order.getPrice();
//                double discountedPrice= order.getPrice() -discountAmount;
//                order.setPrice(discountedPrice);
//            }
//        }
//        return order;
//    }
//}
//
//
//@Test
//public void testPlacedOrderWithDiscount(){
//    Order orderRequest= new Order(101, "mobile",50000);
//    Order orderResponse= service.placeOrder(orderRequest);
//
//    //request price
//    assertEquals(orderRequest.getPrice(),5000);
//
//    //response price
//    assertEquals(orderResponse.getPrice(), 4500);
//}