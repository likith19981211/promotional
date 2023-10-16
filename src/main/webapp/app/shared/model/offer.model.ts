export interface IOffer {
  id?: number;
  offerName?: string;
  ordersForOffer?: number;
  complementary?: number;
}

export const defaultValue: Readonly<IOffer> = {};
