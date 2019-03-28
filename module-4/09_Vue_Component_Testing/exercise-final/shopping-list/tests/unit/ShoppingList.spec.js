import ShoppingList from '@/components/ShoppingList';
/* eslint-disable-next-line no-unused-vars */
import { shallowMount, Wrapper } from '@vue/test-utils';

import chai from 'chai';
chai.should();

describe('ShoppingList', () => {

    /** @type Wrapper */
    let wrapper;

    beforeEach( () => {
        wrapper = shallowMount(ShoppingList);
    });

    it('should be a Vue instance', () => {
        wrapper.isVueInstance().should.be.true;
    });

    it('renders a single shopping list item to the DOM and the name is what we expect it to be', () => {
        const groceries = [ { id: 1, name: 'Milk', completed: false } ];
        wrapper.setData({groceries});
        wrapper.find('.shopping-list ul li').text().should.equal('Milk');
    });

    it('renders 5 items to the DOM and the number of li elements found is 5', () => {
        const groceries = [
            { id: 1, name: 'Oatmeal', completed: false },
            { id: 2, name: 'Milk', completed: false },
            { id: 3, name: 'Banana', completed: false },
            { id: 4, name: 'Strawberries', completed: false },
            { id: 5, name: 'Lunch Meat', completed: false }
        ];
        wrapper.setData({groceries});
        wrapper.findAll('li').length.should.equal(5);
    });

    it('renders an item where completed is false and it should NOT have the class completed', () => {
        const groceries = [ { id: 1, name: 'Milk', completed: false } ];
        wrapper.setData({groceries});
        wrapper.find('.shopping-list ul li').hasClass('completed').should.be.false;
    });

    it('clicking the list item should call our change status method and add the class completed',() => {
        const groceries = [ { id: 1, name: 'Milk', completed: false } ];
        wrapper.setData({groceries});
        wrapper.find('.shopping-list ul li').trigger('click')
        wrapper.find('.shopping-list ul li').hasClass('completed').should.be.true;
    });

});

